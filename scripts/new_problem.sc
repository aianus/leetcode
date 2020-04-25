#!/usr/bin/env amm

import $ivy.`com.lihaoyi::ammonite-ops:2.1.0`, ammonite.ops._

@main
def main(problemName: String, functionSignature: String): Unit = {
  val wd = pwd
  val packageName =
    problemName
      .replaceAll("[^a-zA-Z\\s]", "")
      .toLowerCase
      .split("\\s")
      .mkString("_")

  mkdir! wd / RelPath("src/main/scala/com/alexianus/leetcode/problems") / RelPath(packageName)
}
