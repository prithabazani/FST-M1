1. Get all salesman ids without any repeated values
	 SELECT DISTINCT salesman_id FROM orders; 
2. Display the order number ordered by date in ascending order
	SELECT order_no, order_date FROM orders ORDER BY order_date;
3. Display the order number ordered by purchase amount in descending order
	SELECT order_no, purchase_amount FROM orders ORDER BY purchase_amount DESC;
4. Display the full data of orders that have purchase amount less than 500.
	SELECT * FROM orders WHERE purchase_amount < 500;
5. Display the full data of orders that have purchase amount between 1000 and 2000.
	SELECT * FROM orders WHERE purchase_amount BETWEEN 1000 AND 2000;

