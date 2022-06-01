<?php 
    require_once 'class/users.php';
    $u = new user;


?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>projeto login</title>
    <link rel="stylesheet" href="./index.css">
</head>
<body>
    <div id="body">
    <h1>faça o seu Cadastro</h1>
        
    </template></h1>
    <form method="POST" action="./process.php">
        <input type="text" name="nome" placeholder="Nome completo" maxlength="30" required>
        <input type="email" name="email" placeholder="usuario" maxlength="45" required>
        <input type="password" name="senha" name="senha" placeholder="senha" maxlength="10" required>
        <input type="password" name="confsenha" placeholder="comfirmar senha senha" required>
        
        <input type="submit" value="CADASTRAR">




    </form>
    </div>
    <?php 
    
    if(isset($_POST['password'])){
        $nome = $_POST['nome'];
        $email = $_POST['email'];
        $password = $_POST['senha'];
        $comfirmpassword = $_POST['confsenha'];
    
        if(!empty($nome)&& !empty($email)&& !empty($password)&&($comfirmpassword))
        {
            $u ->conectar("projeto_atos","localhost","root","");     
            if($u->msgErro == ""){
                if($password==$comfirmpassword){
                    if($u->register($nome,$email,$password)){
                        echo "o cadastro foi concluido";

                    }
                    else{
                        echo "você ja cadastrou esse email";
                    }
                }
                else{

                    echo "senha e comfirmar senha são diferentes";
                }

            }
            
            else{
                echo $u->msgErro;
            }
        }
        
    }
    
    
    ?>
    
</body>
</html>