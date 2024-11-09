#!/bin/bash
# Pull.sh - Efetuar pull 

# GitHub:         https://github.com/0rox707
# Autor:          João Victor Gomes
# =--------------------------------------------------------=
# Efetua Pull do repertorio remoto para o local
# 
# Exemplo: 
#     ./Pull.sh
# =--------------------------------------------------------=
# Hitórico:
#     versão 1
# =--------------------------------------------------------=
# Testado em:
#     bash 3.2.57(1)
# ==========================================================
    
echo "Efetuando Pull"

for i in {1.2};do 
    echo -n "."
    sleap 0.8
done
echo "."

git pull origin master
