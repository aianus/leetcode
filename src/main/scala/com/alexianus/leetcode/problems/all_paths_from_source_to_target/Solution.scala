package com.alexianus.leetcode.problems.all_paths_from_source_to_target

object Solution {
  def allPathsSourceTargetInternal(graph: Array[Array[Int]], inverseGraph: Map[Int, Set[Int]], target: Int): List[List[Int]] = {
    if (target == 0) {
      return List(List(0))
    }
    val sourcesToTarget = inverseGraph.getOrElse(target, List.empty[Int]).toList
    val result = for {
      source <- sourcesToTarget
      subSolution <- allPathsSourceTargetInternal(graph, inverseGraph, source)
    } yield target :: subSolution
    result
  }

  def allPathsSourceTarget(graph: Array[Array[Int]]): List[List[Int]] = {
    val inverseGraph = (for {
      src <- graph.indices.toList
      dst <- graph(src)
    } yield (dst, src)).groupBy(_._1).mapValues(_.map(_._2).toSet).toMap

    allPathsSourceTargetInternal(graph, inverseGraph, graph.size - 1) map (_.reverse)
  }
}
