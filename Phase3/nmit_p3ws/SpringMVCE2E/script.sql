create Database ecommerce;
use ecommerce;

CREATE TABLE eproduct_16042026 (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    price DECIMAL(10,2)
);

INSERT INTO eproduct_16042026 (name, price) values
('iphone 17', 80000),
('Sansung S26', 75000),
('OnePlus 12', 65000);


select * from eproduct_16042026;