package com.mercedesbenz.yacto;



abstract class BasePipelineType  {

    def testcommand = "default test command"
    def dockerFilePath = ''
    def dockerFileName = ''
  
    abstract protected void buildStesps()
    abstract protected void dockerBuild()
    abstract protected void runTestcommand()

    void startPipeline(){
        this.build()
    }
}