package com.mypro.mypipelinetype;
import com.myproject.mypipelinetype.YactoPipeline;

class YactoPipeline extends BasePipelineType {
    def dockerImage = "ubuntu"
    def scmtype = 'git'
    
    def build(){
        buildStesps()
        dock erBuild()
    }
  
    void buildStesps(){
        println "checkout stage happens here: ${this.scmtype}"
       
    }

    void dockerBuild(){
        println "dockerbuilds happens here : ${this.dockerImage}"
        
    } 
}