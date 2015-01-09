ALTER TABLE test ADD email varchar(255);
UPDATE test set email = '(empty)';
ALTER TABLE test MODIFY email varchar(255) NOT NULL;