create database PRJ_Test;

-- Tables and attributes taken from data dictionary

create table MAJOR(
	MAJOR_NUM int not null,
	MAJOR_NAME varchar(30) not null,
	ABET_ACCR varchar(3),
	primary key (MAJOR_NUM)
);

create table PROFESSION(
	PROF_NUM bigint(20) not null,
	PROF_NAME varchar(30) not null, 
	PROF_DEG varchar(30),
	PROF_EWE varchar(30),
	PROF_JOB int,
	MAJOR_NUM bigint(20),
	primary key (PROF_NUM),
	foreign key (MAJOR_NUM) references MAJOR(MAJOR_NUM)
);

create table LOCATION(
	LOC_NUM bigint(20) not null,
	LOC_STATE varchar(15),
	LOC_EMP int,
	LOC_QUO double,
	PROF_NUM bigint(20),
	primary key (LOC_NUM),
	foreign key (PROF_NUM) references PROFESSION(PROF_NUM)
);

create table CONCENTRATION(
	CON_NUM bigint(20) not null,
	CON_NAME varchar(30) not null,
	MAJOR_NUM bigint(20),
	primary key (CON_NUM),
	foreign key (MAJOR_NUM) references MAJOR(MAJOR_NUM)
);

create table STUDENT(
	STU_NUM bigint(20) not null,
	STU_FNAME varchar(30) not null,
	STU_LNAME varchar(30) not null,
	MAJOR_NUM bigint(20),
	primary key (STU_NUM),
	foreign key (MAJOR_NUM) references MAJOR(MAJOR_NUM)
);

create table WAGE(
	WAGE_NUM bigint(20) not null,
	WAGE_MEANH double,
	WAGE_ANNUAL int,
	WAGE_MEDH double, 
	WAGE_MEDA int,
	PROF_NUM bigint(20),
	primary key (WAGE_NUM),
	foreign key (PROF_NUM) references PROFESSION(PROF_NUM)
);

create table INDUSTRY1(
	FIND_ID bigint(20) not null,
	FIND_NAME varchar(30) not null,
	FIND_FIRST int,
	FIND_FHMW double, 
	FIND_FAMW int,
	PROF_NUM bigint(20),
	primary key (FIND_ID),
	foreign key (PROF_NUM) references PROFESSION(PROF_NUM)
);

create table INDUSTRY2(
	SIND_ID bigint(20) not null,
	SIND_NAME varchar(30) not null,
	SIND_SCND int,
	SIND_SHMW double, 
	SIND_SAMW int,
	PROF_NUM bigint(20),
	primary key (SIND_ID),
	foreign key (PROF_NUM) references PROFESSION(PROF_NUM)
);

create table INDUSTRY3(
	TIND_ID bigint(20) not null,
	TIND_NAME varchar(30) not null,
	TIND_THRD int,
	TIND_THMW double, 
	TIND_TAMW int,
	PROF_NUM bigint(20),
	primary key (TIND_ID),
	foreign key (PROF_NUM) references PROFESSION(PROF_NUM)
);




-- Add data to tables

-- MAJORS

insert into MAJOR
(MAJOR_NUM, MAJOR_NAME, ABET_ACCR)
values
('001', 'Computer Science', '');

insert into MAJOR
(MAJOR_NUM, MAJOR_NAME, ABET_ACCR)
values
('002', 'Computer Engineering', '');

insert into MAJOR
(MAJOR_NUM, MAJOR_NAME, ABET_ACCR)
values
('003', 'Electrical Engineering', '');

insert into MAJOR
(MAJOR_NUM, MAJOR_NAME, ABET_ACCR)
values
('004', 'Mechanical Engineering', '');

insert into MAJOR
(MAJOR_NUM, MAJOR_NAME, ABET_ACCR)
values
('005', 'Business Analytics', '');

insert into MAJOR
(MAJOR_NUM, MAJOR_NAME, ABET_ACCR)
values
('006', 'Data Science', '');

insert into MAJOR
(MAJOR_NUM, MAJOR_NAME, ABET_ACCR)
values
('007', 'Environmental Engineering', '');

insert into MAJOR
(MAJOR_NUM, MAJOR_NAME, ABET_ACCR)
values
('008', 'Engineering Mathematics', '');

insert into MAJOR
(MAJOR_NUM, MAJOR_NAME, ABET_ACCR)
values
('009', 'Engineering Physics', '');





-- Professions

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1001', 'Aerospace Engineer', '', '', '', '004');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1001', 'Aerospace Engineer', '', '', '', '009');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1002', 'Architectural and Engineering Manager', '', '', '', '003');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1003', 'Automotive Engineer', '', '', '', '004');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1004', 'Biomedical Engineer', '', '', '', '009');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1005', 'Budget Analyst', '', '', '', '005');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1006', 'Business Analyst', '', '', '', '005');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1007', 'Business Intelligence Analyst', '', '', '', '006');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1008', 'Business Operations Specialists', '', '', '', '005');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1009', 'Civil Engineers', '', '', '', '007');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1009', 'Civil Engineers', '', '', '', '009');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1010', 'Clinical Data Managers', '', '', '', '006');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1011', 'Computer and Information Research Scientists', '', '', '', '001');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1012', 'Computer and Information Systems Manager', '', '', '', '001');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1013', 'Computer Hardware Engineer', '', '', '', '002');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1013', 'Computer Hardware Engineer', '', '', '', '003');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1014', 'Computer Network Architects', '', '', '', '002');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1015', 'Computer Programmer', '', '', '', '001');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1015', 'Computer Programmer', '', '', '', '001');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1016', 'Computer Systems Analyst', '', '', '', '001');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1016', 'Computer Systems Analyst', '', '', '', '002');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1017', 'Computer Systems Engineer', '', '', '', '001');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1017', 'Computer Systems Engineer', '', '', '', '002');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1018', 'Computer User Support Specialists', '', '', '', '001');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1018', 'Computer User Support Specialists', '', '', '', '002');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1019', 'Data Architect', '', '', '', '006');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1020', 'Data Warehousing Specialist', '', '', '', '006');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1021', 'Database Administrator', '', '', '', '001');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1021', 'Database Administrator', '', '', '', '006');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1022', 'Database Architect', '', '', '', '001');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1023', 'Drafters', '', '', '', '004');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1024', 'Economists', '', '', '', '005');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1025', 'Electrical and Electronics Engineering Technician', '', '', '', '003');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1026', 'Electrical and Electronics Installer and Repairer', '', '', '', '003');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1027', 'Electrical Engineer', '', '', '', '003');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1028', 'Electrical Engineering Technician', '', '', '', '008');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1029', 'Electrical Engineering Technnologist', '', '', '', '008');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1030', 'Electrician', '', '', '', '003');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1031', 'Electromechanical Engineering Technologists', '', '', '', '008');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1032', 'Electromechanical  Technician', '', '', '', '003');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1033', 'Electronics Engineer', '', '', '', '002');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1033', 'Electronics Engineer', '', '', '', '003');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1033', 'Electronics Engineer', '', '', '', '008');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1034', 'Energy Engineer', '', '', '', '007');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1035', 'Engineering Teachers', '', '', '', '008');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1036', 'Environmental Compliance Inspectors', '', '', '', '007');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1037', 'Environmental Economists', '', '', '', '007');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1038', 'Environmental Engineering Technician', '', '', '', '007');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1038', 'Environmental Engineering Technician', '', '', '', '008');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1039', 'Environmental Engineer', '', '', '', '007');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1040', 'Environmental Restoration Planner', '', '', '', '007');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1041', 'Environmental Science and Protection Technician', '', '', '', '007');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1042', 'Environmental Scientist and Specialist', '', '', '', '007');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1043', 'Financial Analyst', '', '', '', '006');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1044', 'Financial Quantitative Analyst', '', '', '', '006');

insert into PROFESSION
(PROF_NUM, PROF_NAME, PROF_DEG, PROF_EWE, PROF_JOB, MAJOR_NUM)
values
('1045', 'Hydrologist', '', '', '', '007');





-- Concentrations

-- Computer Science

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2001', 'Advanced Topics', '001');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2002', 'Autonomous Systems', '001');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2003', 'Big Data Analytics', '001');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2004', 'Information Assurance and Cyber Security', '001');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2005', 'Game Development and Simulation', '001');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2006', 'Software Engineering', '001');

-- Computer Engineering

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2001', 'Advanced Topics', '002');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2007', 'Autonomous Robotic Systems', '002');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2008', 'Digital Logic Design', '002');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2009', 'Embedded System Design', '002');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2010', 'Machine Intelligence', '002');

-- Electrical Engineering --

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2001', 'Advanced Topics', '003');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2011', 'Control Systems', '003');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2012', 'Electromagnetic and Communications', '003');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2013', 'Renewable Energy', '003');

-- Mechanical Engineering

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2001', 'Advanced Topics', '004');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2014', 'Aerospace', '004');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2015', 'Materials and Advanced Manufacturing', '004');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2016', 'Mechanical Thermal Systems', '004');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2017', 'Nanotechnology', '004');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2018', 'Operations Research', '004');

-- Business Analytics

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2019', 'Logistics and Supply Chain Management', '005');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2020', 'Health Informatics', '005');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2021', 'Intelligent Mobility', '005');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2022', 'Quantitative Economics and Econometrics', '005');

-- Data Science

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2003', 'Big Data Analytics', '006');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2020', 'Health Informatics', '006');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2021', 'Intelligent Mobility', '006');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2022', 'Quantitative Economics and Econometrics', '006');

-- Environmental Engineering

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2023', 'Modern Techniques in Sustainability', '007');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2024', 'Water', '007');

-- Engineering Mathematics

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2025', 'Complex Systems Mathematics', '008');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2026', 'Mathematics of Medicine and BIology', '008');

-- Engineering Physics

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2027', 'Physics of Energy and Sustainability', '009');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2028', 'Physics of Medicine', '009');

insert into CONCENTRATION
(CON_NUM, CON_NAME, MAJOR_NUM)
values
('2029', 'Physics of Space', '009');