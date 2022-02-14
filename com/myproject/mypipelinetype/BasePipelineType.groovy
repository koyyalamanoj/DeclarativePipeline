package com.myproject.mypipelinetype;

import com.myproject.*

abstract class BasePipelineType  {

    def testcommand = "default test command"
    def dockerFilePath = ''
    def dockerFileName = ''
  
    
    String runTestcommand() {
        println "executing test here with below command: \n"+''+ testcommand
    }
    abstract protected void buildStesps()
    abstract protected void dockerBuild()

    void startPipeline(){
        this.build()
        runTestcommand()
    }
}