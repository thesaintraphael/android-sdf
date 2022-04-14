

class CategoryService{


    fun getCategories(userId : String){
        var  url : String = "api?userId=$userId"

       var statusCode= sendRequest(url=url)

       

       if(statusCode==200){
            println("Show Categories")
           }
           else{
               println("Something went wrong")
           }
        

        
    }


    fun sendRequest (url:String) : Int{
        println("Request sent to $url")
        return 200
    }

  
}