CREATE TABLE manager(
   managerID varchar2(20) PRIMARY KEY,
   managerName varchar2(20) not null,
   password  varchar2(20) not null,
   phone varchar2(20),
   QQ varchar2(20)
);
CREATE TABLE use( 
   userNumber varchar2(20)  PRIMARY KEY,
   username varchar2(20) unique not null,  
   password varchar2(20) NOT NULL,                    
   sex varchar2(2) NOT NULL,                           
   email  varchar2(50) NOT NULL,                        
   qq varchar2(20) default NULL,                    
   signature varchar2(300) default NULL,            	
   grade varchar2(20) default NULL                                 
);
CREATE TABLE room (
   roomID varchar2(20)  PRIMARY KEY,
   roomName varchar2(20) NOT NULL,                   
   kind int default NULL, 
   description varchar2(300) default ''                             
);