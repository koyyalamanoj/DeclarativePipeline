import com.mercedesbenz.yacto.*;
import com.mercedesbenz.yacto.YactoPipeline;

def buildType = new YactoPipeline(
      dockerImage:'windows',
      scmtype:'gitlab',
      );

buildType.startPipeline()




