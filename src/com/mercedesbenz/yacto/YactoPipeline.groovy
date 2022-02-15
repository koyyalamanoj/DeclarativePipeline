package com.mercedesbenz.yacto;
import com.mercedesbenz.yacto.BasePipelineType;

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
        this.sh "checkout stage happens here: ${this.scmtype}"
       
    }

    void dockerBuild(){
        println "dockerbuilds happens here : ${this.dockerImage}"
        
    } 
    void runTestcommand(){
          prinntln "executing test here with below command: \n"+''+ testcommand
        
    } 
}