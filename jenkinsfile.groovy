import com.myproject.*
import com.myproject.mypipelinetype.*
import com.myproject.mypipelinetype.YactoPipeline;

def buildType = new YactoPipeline(
      dockerImage:'windows',
      scmtype:'gitlab',
      );

buildType.startPipeline()



