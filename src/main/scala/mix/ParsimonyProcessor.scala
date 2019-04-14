package main.scala.mix

import java.io.{File, PrintWriter}

import beast.util.TreeParser
import main.scala.node.{BestTree, RichNode}
import main.scala.annotation.AnnotationsManager

/**
  * given all the parts we need to make a rich JSON version
  * of a parsimony tree from the MIX program, make the enhanced tree
  */
class ParsimonyProcessor(mixTrees: File,
                         mixOutput: File,
                         annotations: File,
                         sampleToClade: File,
                         eventsToNumbers: File,
                         eventColorsFile: Option[File],
                         otherAnnotations: List[File],
                         numberOfTargets: Int,
                         outputFile: File) {

  // TODO: add a normalization process like FigTree for proportional scaling
  // TODO: check proportions

  /*
  // find the best tree from the mix output
  val bestTreeContainer = BestTree(mixTrees)

  // parse out the annotations from the mix (PHYLIP) output
  val mixParser = new MixParser(mixOutput.getAbsolutePath, eventsToNumbers.getAbsolutePath, bestTreeContainer.maxIndex)

  // load our tree
  val treeParser = new TreeParser(bestTreeContainer.bestTreeString, false, true, true, bestTreeContainer.maxIndex)

  // load up any annotations we have
  val annotationMapping = new AnnotationsManager(annotations, sampleToClade, eventColorsFile)

  // traverse the nodes and add names to any internal nodes without names
  val rootNode = RichNode(treeParser.getRoot,annotationMapping, None,numberOfTargets)

  // reassign the names
  val rootName = RichNode.recAssignNames(rootNode, mixParser)

  // now apply the parsimony results to the root of the tree (recursively walking down the nodes)
  RichNode.applyParsimonyGenotypes(rootNode, mixParser,numberOfTargets)

  // check that the nodes we assigned are consistent
  RichNode.recCheckNodeConsistency(rootNode, mixParser)

  // count nodes before
  println("before collapsing nodes " + rootNode.countSubNodes())

  // collapse nodes from the root
  ParsimonyCollapser.collapseNodes(rootNode)

  // sort the nodes
  RichNode.reorderChildrenByAlleleString(rootNode)

  // add gray lines to branches where we're going to two identical alleles with different tissue sources
  RichNode.assignBranchColors(rootNode)

  // the updated numbers
  println("after collapsing nodes " + rootNode.countSubNodes())

  // assign the colors to the nodes
  RichNode.applyFunction(rootNode,annotationMapping.setNodeColor)

  // get an updated height to flip the tree around
  val maxHeight = RichNode.maxHeight(rootNode)

  // now output the adjusted tree
  val output = new PrintWriter(outputFile.getAbsolutePath)
  output.write("[{\n")
  output.write(RichNode.toJSONOutput(rootNode, None,1.0))
  output.write("}]\n")
  output.close()
  */

}


