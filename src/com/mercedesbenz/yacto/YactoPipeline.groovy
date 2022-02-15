package com.mercedesbenz.yacto;
import com.mercedesbenz.yacto.BasePipelineType;
import com.mercedesbenz.yacto.Dsl;

class YactoPipeline extends BasePipelineType {
    def dockerImage = "ubuntu"
    def scmtype = 'git'
    def testcommand = "default test command"
    
    def build(){
        buildStesps()
        dockerBuild()
        runTestcommand()
    }
  
    def buildStesps(){
        def x = new Dsl() 
        x.print "checkout stage happens here: ${this.scmtype}"
       
    }

    def dockerBuild(){
       // println "dockerbuilds happens here : ${this.dockerImage}"
        
    } 
    def runTestcommand(){
        //  prinntln "executing test here with below command: \n"+''+ testcommand
        
    } 
}