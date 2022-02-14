package com.mercedesbenz.yacto;



abstract class BasePipelineType  {

    
    def dockerFilePath = ''
    def dockerFileName = ''
  
    
    
    abstract protected void buildStesps()
    abstract protected void dockerBuild()
    abstract protected void runTestcommand()

    void startPipeline(){
        this.build()
        
    }
}