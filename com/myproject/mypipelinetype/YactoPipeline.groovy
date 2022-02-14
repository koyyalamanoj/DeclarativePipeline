package com.myproject.mypipelinetype;
import com.myproject.*

class YactoPipeline extends BasePipelineType {
    def dockerImage = "ubuntu"
    def scmtype = 'git'
    
    def build(){
        buildStesps()
        dockerBuild()
    }
  
    void buildStesps(){
        println "checkout stage happens here: ${this.scmtype}"
       
    }

    void dockerBuild(){
        println "dockerbuilds happens here : ${this.dockerImage}"
        
    } 
}