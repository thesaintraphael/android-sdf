data class DataUsers(var username: String, var password: String)

class Users{
    var listOfUsers = listOf(DataUsers("Samir", "123456"), DataUsers("Rafael", "123456"), DataUsers("Ibrahim", "123456"));
}

class LogIn {
    var user: Users = Users();
    var limit: Int = 0;

    fun logIn(){
        while(true){
            limit += 1;
            if(limit > 4) {
                println("The instant interval is exceeded!");
                break;
            }
            
            print("Username: ");    var username: String = readLine().toString();
            print("Password: ");    var password: String = readLine().toString();
            var inputUser = DataUsers(username, password);

            if(validate(inputUser))    println("Good!");
        }
    }

    fun validate(inputUser: DataUsers): Boolean{
        if (inputUser.username.isEmpty()){
            println("Enter username!");
            return false;
        }
        else if (inputUser.password.isEmpty()){            
            println("Enter password!");
            return false;
        }
        else if (this.user.listOfUsers.find(){it == inputUser} == null){
            println("Username or password not corret!");
            return false;
        }
        else{
            println("Welcome!");
            return true;
        }
    }
}

 
fun main() {
    val test = LogIn();
    test.logIn();
}