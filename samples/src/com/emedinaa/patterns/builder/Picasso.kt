package com.emedinaa.patterns.builder

/**
 * Created by eduardomedina on 6/04/17.
 */
class Picasso (val path:String,val context: Any,val imageView: Any,val width: Int, val  heigth: Int) {

    init {
        loadImage()
    }

    fun loadImage(){
        println("load Image  path $path imageView $imageView")
    }


    companion  object {
        class Builder{

            var path:String = ""
            var context:Any = ""
            var imageView:Any = ""
            var width:Int = 0
            var heigth:Int = 0

            fun with(context: Any): Builder {
                this.context=context
                return this
            }

            fun load(path: String): Builder {
                this.path=path
                return this
            }

            fun resize(width:Int, heigth: Int): Builder {
                this.width= width
                this.heigth= heigth
                return this
            }

            fun into(imageView: Any): Builder {
                this.imageView= imageView
                return this
            }

            fun build()= Picasso(path,context,imageView,width,heigth)

        }
    }

}



