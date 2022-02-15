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
        sh "echo checkout stage happens here: ${this.scmtype}"
       
    }

    void dockerBuild(){
        sh "echo dockerbuilds happens here : ${this.dockerImage}"
        
    } 
    void runTestcommand(){
         sh "echo executing test here with below command: \n"+''+ testcommand
        
    } 
}