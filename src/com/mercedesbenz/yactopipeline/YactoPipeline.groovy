package com.mercedesbenz.yactopipeline;
import com.mercedesbenz.yactopipeline.BasePipelineType 

class YactoPipeline extends BasePipelineType {
    def dockerImage = "ubuntu"
    def scmtype = 'git'
    def testcommand = "default test command"
    
    def build(){
        buildStesps()
        dockerBuild()
        runTestcommand()
    }
  
    void buildStesps(){
        println "checkout stage happens here: ${this.scmtype}"
       
    }

    void dockerBuild(){
        println "dockerbuilds happens here : ${this.dockerImage}"
        
    }
   void runTestcommand() {
        println "executing test here with below command: \n"+''+ testcommand
} 
}