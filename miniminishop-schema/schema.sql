
select "member";

CREATE TABLE member (
  member_id BIGINT NOT NULL,
  member_type INT NOT NULL,
  member_name VARCHAR(32) NOT NULL,
  member_phone VARCHAR(20) NOT NULL,
  member_start_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  member_total_cash BIGINT NOT NULL DEFAULT 0
);

ALTER TABLE member ADD PRIMARY KEY(member_id);

select "orders";

CREATE TABLE orders (
  order_id BIGINT NOT NULL,
  order_status VARCHAR(32) NOT NULL,
  member_id BIGINT NOT NULL,
  delivery_id BIGINT NOT NULL
);

ALTER TABLE orders ADD PRIMARY KEY(order_id);

select "delivery";

CREATE TABLE delivery (
  delivery_id BIGINT NOT NULL,
  delivery_status VARCHAR(32) NOT NULL,
  member_id BIGINT NOT NULL
);

ALTER TABLE delivery ADD PRIMARY KEY(delivery_id);

select "item";

CREATE TABLE item (
  item_id BIGINT NOT NULL,
  item_name VARCHAR(64) NOT NULL,
  item_amount INT NOT NULL,
  item_price BIGINT NOT NULL,
  update_dt VARCHAR(80) NOT NULL
);

ALTER TABLE item ADD PRIMARY KEY(item_id);

select "orderitem";

CREATE TABLE orderitem (
  orderitem_id BIGINT NOT NULL,
  memberId BIGINT NOT NULL,
  itemId BIGINT NOT NULL,
  itemPrice BIGINT NOT NULL,
  itemAmount INT NOT NULL,
  orderId BIGINT NOT NULL
);

ALTER TABLE orderitem ADD PRIMARY KEY(orderitem_id);
