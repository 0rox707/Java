#!/bin/bash
# Commit.sh - Commit Push Git

# GitHub:         https://github.com/0rox707
# Autor:          João Victor Gomes
# =--------------------------------------------------------=
# Commita e da Push para um repertorio remoto ja vinculado a pasta.

# Exemplo: 
#     ./Commit.sh
# =--------------------------------------------------------=
# Hitórico:
#     Versão 1.1
# =--------------------------------------------------------=
# Testado em:
#       Bash versão 5.2.21(1)
# ==========================================================


clear
echo "Fazer commit"$'\n'"--------------"$'\n'"Mensagem de commit"$'\n'"Para cancelar o Commit digite //c"
read msg
clear
if [ $msg = "//c" ] || [ $msg = "//C" ];then 
    i=0
    echo -n "encerrando"
    while [ $i -lt 2 ];do
    i=$(( $i + 1 ))
    echo -n "."
    sleep 0.5
    done
    echo "."
    exit
    
fi
git commit -m "$msg"
g=0
while [ $g -eq 0 ];do
    clear
    echo "Gostaria de da push para o repertorio remoto"$'\n'"s/n"
    read r
    if [ $r = "s" ] || [ $r = "S" ];then
        clear
        git push -u origin master
        echo "push feito com sucesso!"
        exit
    elif [ $r = "N" ] || [ $r = "n" ];then
        i=0
        clear
        echo -n "encerrando"
        while [ $i -lt 2 ];do
        i=$(( $i + 1 ))
        echo -n "."
        sleep 0.5
        done
        echo "."
        exit
    else
        echo "Opção invalida!!"
    fi
done




