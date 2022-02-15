@Library('TestLibrary@main') _
import hudson.model.*
import com.mercedesbenz.yacto.YactoPipeline;
node {
def buildType = new YactoPipeline(
      dockerImage:'windows',
      scmtype:'gitlab',
      );

buildType.startPipeline()
}



