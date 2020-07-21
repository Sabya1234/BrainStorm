# BrainStorm
Having Project related to Out of the Box Concept

This has one maven project including 2 different java file.

1)ReadFromPdf--reading test from PDF file using pdfbox api
2)ReadFromImage- Reading Text from an image using tesseract(tess4j) jar.

Just add this project in eclipse using" existing maven project " option.



Prerequisite for using the "tessdata"
Please create a system variable "TESSDATA_PREFIX" under Environmental Variable   and put the value as path of the tessdata folder.

In current project I have put tessdata folder in current project directory. you do not have to do that. Please follow the below mentioned link to download the language data set 

https://github.com/tesseract-ocr/tessdata/tree/3.04.00

tou can download all languages or just concentrate on your preferred language data set and just create a folder "tessdata" and put all the files under it.
