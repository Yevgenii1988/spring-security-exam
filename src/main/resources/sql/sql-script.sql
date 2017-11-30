drop table user_role;
drop table role;
drop table user;

create table user(id int NOT NULL AUTO_INCREMENT, username varchar(256) not null, password char(32) not null, amount double, PRIMARY KEY ( id ));
create table role(id int NOT NULL AUTO_INCREMENT, role varchar(64) not null, PRIMARY KEY ( id ) );
create table user_role(id int not null auto_increment, id_user int not null, id_role int not null, primary key (id), 
foreign key(id_user) references user(id), foreign key(id_role) references role(id));

insert into user(username,password,amount) values('john doe', 'aaa', 20.0),('jane doe','bbb', 10.0);
insert into role(role) values('admin'),('user'),('guest');
insert into user_role(id_user, id_role) values(1,1),(2,1);