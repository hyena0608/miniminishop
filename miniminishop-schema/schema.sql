
select "member";

CREATE TABLE member (
  member_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  member_type INT NOT NULL,
  member_name VARCHAR(32) NOT NULL,
  member_phone VARCHAR(20) NOT NULL,
  member_start_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

select "orders";

CREATE TABLE orders (
  order_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  order_status VARCHAR(32) NOT NULL,
  member_id BIGINT NOT NULL,
  delivery_id BIGINT NOT NULL
);

select "delivery";

CREATE TABLE delivery (
  delivery_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  delivery_status VARCHAR(32) NOT NULL,
  member_id BIGINT NOT NULL
);

select "item";

CREATE TABLE item (
  item_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  item_name VARCHAR(64) NOT NULL,
  item_amount INT NOT NULL,
  item_price BIGINT NOT NULL
);

select "orderitem";

CREATE TABLE orderitem (
  orderitem_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  memberId BIGINT NOT NULL,
  itemId BIGINT NOT NULL,
  itemPrice BIGINT NOT NULL,
  itemAmount INT NOT NULL,
  orderId BIGINT NOT NULL
);
