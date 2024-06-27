package com.coding.intr.codingjava13.exercicios.sala;


/* Escreva um programa Java para listar os conjuntos de caracteres disponíveis em
objetos charset."
Saída Esperada

Lista de conjuntos de caracteres disponíveis:
Big5
Big5-HKSCS
CESU-8
EUC-JP
EUC-KR
GB18030
GB2312
GBK

...
x-SJIS_0213
x-UTF-16LE-BOM

X-UTF-32BE-BOM
X-UTF-32LE-BOM
x-windows-50220
x-windows-50221
x-windows-874
x-windows-949
x-windows-950
x-windows-iso2022jp

*/


import java.nio.charset.Charset;
import java.util.Map;

public class Exercicio_10 {

    public static void main(String[] args) {
        // Obter o mapa de charsets disponíveis
        Map<String, Charset> charsets = Charset.availableCharsets();

        // Imprimir o cabeçalho
        System.out.println("Lista de conjuntos de caracteres disponíveis:");

        // Listar cada charset disponível
        for (String charsetName : charsets.keySet()) {
            System.out.println(charsetName);
        }
    }
}




