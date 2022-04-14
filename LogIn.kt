data class DataUsers(var username: String, var password: String)

class Users{
    var listOfUsers = listOf(DataUsers("Samir", "123456"), DataUsers("Rafael", "123456"), DataUsers("Ibrahim", "123456"));
}

class LogIn {
    var users: Users = Users();
    var limit: Int = 1;

    fun logIn(){
        while(true){
            this.limit++;
            if(this.limit > 4)   break;
            
            print("Username: ");    var username = readline().toString();     println();
            print("Password: ");    var password = readline().toString();     println();
            var inputUser = DataUsers(username, password);

            if(validate(inputUser))    { println("Good!");	break; }
        }
    }

    fun validate(inputUser: DataUsers): Boolean{
        if (this.limit > 4){
            println("The instant interval is exceeded!");
            return false;
        }

        if (inputUser.username.isEmpty()){
            println("Enter username!");
            return false;
        }
        
        if (inputUser.password.isEmpty()){            
            println("Enter password!");
            return false;
        }
        
        if (this.users.listOfUsers.find(){it == inputUser} == null){
            println("Username or password not corret!");
            if (this.limit > 1){
                print("Forgot Password? (Y/n): ");  var answer = "Y"; println("Y");
                if (answer == "Y"){
                    Reset(inputUser.username, this.users);
                    this.limit--;
                }
            }
            return false;
        }
        
        return true;
    }
}

class Reset(username: String, users: Users){
    init{
        var newPassword = readline().toString();
        users.listOfUsers.find(){ it.username == username }!!.password = newPassword;
    }
}

fun main() {
    val test = LogIn();
    test.logIn();
}