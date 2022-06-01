<?php 
    class user{
        private $pdo;
        public $msgErro = "";
        public function conectar($nome,$host,$usuario,$senha){

            global $pdo;
            try{
                $pdo = new PDO("mysql:dbname=".$nome.";host=".$host,$usuario,$senha);
            } catch(PDOException $e) {
                $msgErro = $e ->getMessage();

            }
        }

        public function register($nome,$email,$password){

            global $pdo;
            $sql = $pdo -> prepare("SELECT id_usuario FROM users WHERE email = e:" );
            $sql -> bindvalue(":e",$email);
            $sql->execute();
            if($sql->rowcount()>0){
                return false;
            }
            else{

                $sql= $pdo->prepare("INSERT INTO users (nome,email,passoword) VALUES (:n,:e,:p)");
                $sql -> bindvalue(":n",$nome);
                $sql -> bindvalue(":e",$email);
                $sql -> bindvalue(":p",md5($password));
                $sql->execute();
                return true;
            }
        }
        public function login($email,$password){


            global $pdo;
            $sql = $pdo -> prepare("SELECT id_usuario FROM users WHERE email=:e AND passoword=:p");
            $sql -> bindvalue(":e",$email);
            $sql-> bindvalue(":p",md5($password));
            $sql->execute();
            if($sql->rowCount>0){
                $dado = $sql->fetch();
                session_start();
                $_SESSION['id_usuario'] = $dado['id_usuario'];
                return true;
            }
            else{
                
                return false;

            }



        }



    }








?>