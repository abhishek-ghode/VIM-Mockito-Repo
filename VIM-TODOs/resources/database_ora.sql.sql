DECLARE
v_count NUMBER :=0;
BEGIN
SELECT COUNT(*) INTO v_count FROM all_tables WHERE table_name='CAR' AND owner='VIM';
IF v_count = 1 THEN
EXECUTE IMMEDIATE 'DROP TABLE VIM.CAR';
END IF;
END;
/

CREATE SEQUENCE   "CARIDSEQUENCE"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  NOORDER  NOCYCLE
/

CREATE TABLE  "CAR" 
   (	"ID" NUMBER NOT NULL ENABLE, 
	"MAKE" VARCHAR2(50)NOT NULL ENABLE, 
	"MODEL" VARCHAR2(50), 
	"MODEL_YEAR" VARCHAR2(50), 
	 CONSTRAINT "CAR_PK" PRIMARY KEY ("ID") ENABLE
   )
/


CREATE OR REPLACE TRIGGER  "BI_CAR" 
  before insert on "CAR"               
  for each row  
begin   
    select "CARIDSEQUENCE".nextval into :NEW.ID from dual; 
end; 

/
ALTER TRIGGER  "BI_CAR" ENABLE
/

insert into CAR (MAKE,MODEL,MODEL_YEAR) values('Honda','Civic','2009');

insert into CAR (MAKE,MODEL,MODEL_YEAR) values('Tata','indiaca','2010');

commit
/

            

     
      