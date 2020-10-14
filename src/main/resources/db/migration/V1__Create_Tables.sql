drop table if exists question_bank ;

create table question_bank (
    question_id serial not null primary key,
    question_text text not null,
    question_body text not null,
    correct_answers int not null,
    question_options varchar array not null,
    multiple_answers boolean not null
) ;


insert into question_bank (question_text, question_body, correct_answers, question_options, multiple_answers) values ('What will the program print when compiled and run ?', 'public class TestClass{ public static void main(String[] args){ System.out.println("Hello World!!")}}',1,Array ['The code will not compile', 'The code will compile fine as is','It will print some random junk code'],'t');
insert into question_bank (question_text, question_body, correct_answers, question_options, multiple_answers) values ('What will the following code snippet print when compiled and run ?', 'byte starting = 3;
short firstValue = 5;
int secondValue = 7;
int functionValue = (int) (starting/2 + firstValue/2 + (int) firstValue/3 ) + secondValue/2;
System.out.println(functionValue);',1,Array ['7', '8','10','11','12','It will not compile.'],'f');