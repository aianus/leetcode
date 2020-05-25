#!/usr/bin/env amm

import $ivy.`com.lihaoyi::ammonite-ops:2.1.0`
import ammonite.ops._

@main
def main(problemName: String, functionSignature: String): Unit = {
  val wd = pwd
  val packageName =
    problemName
      .replaceAll("[^a-zA-Z\\s]", "")
      .toLowerCase
      .split("\\s")
      .mkString("_")

  val implementationFile = wd / RelPath("src/main/scala/com/alexianus/leetcode/problems") / RelPath(packageName) / "Solution.scala"
  val testFile = wd / RelPath("src/test/scala/com/alexianus/leetcode/problems") / RelPath(packageName) / "SolutionSpec.scala"

  val implementationContents =
    s"""package com.alexianus.leetcode.problems.${packageName}
      |
      |object Solution {
      |  def ${functionSignature} = {
      |
      |  }
      |}
      |""".stripMargin

  val testContents =
    s"""package com.alexianus.leetcode.problems.${packageName}
      |
      |import com.alexianus.leetcode.UnitSpec
      |
      |class SolutionSpec extends UnitSpec {
      |  it ("works for the given examples") {
      |
      |  }
      |}
      |""".stripMargin

  write(implementationFile, implementationContents, createFolders = true)
  write(testFile, testContents, createFolders = true)
}
