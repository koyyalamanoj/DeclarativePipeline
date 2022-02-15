package com.mercedesbenz.yacto



abstract class BasePipelineType  {

    def testcommand = "default test command"
    def dockerFilePath = ''
    def dockerFileName = ''
  
     abstract protected def buildStesps()
    abstract protected def dockerBuild()
    abstract protected def runTestcommand()

    def startPipeline(){
        this.build()
    }
}