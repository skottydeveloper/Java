A store sells a number of products. The initial stock is shown below:
Name	Stock	Price
Whiteboard Marker	85	$1.50
Whiteboard Eraser	45	$5.00
Black Pen	100	$1.50
Red Pen	100	$1.50
Blue Pen	100	$1.50

The store has a cash register which stores all cash from sales of the store's product. The store clerk uses the following menu:
-  sell
-  restock
-  view stock
-  view cash
-  prune products
-  exit (Show Done)

The "prune products" option removes all products with zero stock from the store.

Sample I/O:
Choice (s/r/v/c/p/x): ?
Menu options
s = sell
r = restock
v = view stock
c = view cash
p = prune products
x = exit
Choice (s/r/v/c/p/x): v
Whiteboard Marker - 85 at $1.50
Whiteboard Eraser - 45 at $5.00
Black Pen - 100 at $1.50
Red Pen - 100 at $1.50
Blue Pen - 100 at $1.50
Choice (s/r/v/c/p/x): s
Name: Whiteboard Eraser
Selling Whiteboard Eraser
Number: 46
Not enough stock
Choice (s/r/v/c/p/x): s
Name: Whiteboard Eraser
Selling Whiteboard Eraser
Number: 45
Choice (s/r/v/c/p/x): s
Name: Red Pen
Selling Red Pen
Number: 100
Choice (s/r/v/c/p/x): v
Whiteboard Marker - 85 at $1.50
Whiteboard Eraser - 0 at $5.00
Black Pen - 100 at $1.50
Red Pen - 0 at $1.50
Blue Pen - 100 at $1.50
Choice (s/r/v/c/p/x): p
Choice (s/r/v/c/p/x): r
Name: Blue Pen
Restocking Blue Pen
Number: 5
Choice (s/r/v/c/p/x): v
Whiteboard Marker - 85 at $1.50
Black Pen - 100 at $1.50
Blue Pen - 105 at $1.50
Choice (s/r/v/c/p/x): s
Name: Pie
No such product
Choice (s/r/v/c/p/x): c
Cash: $375.00
Choice (s/r/v/c/p/x): x
Done

In addition to the basic functionality above, your program should also satisfy the following requirements:
-  The "sell" option prints an error if the selected product is not found.
-  The "sell" option ignores the case of the product name (e.g. bLaCk pEn).
-  The "sell" option allows the product name to be partially entered. e.g. Entering "red" will sell a "Red Pen". Entering "pen" will instead show a list of matching products (Black Pen, Red Pen, Blue Pen).
-  The "restock" option also allows a partial product name to be entered. All matching products will be restocked.
-  The "restock" option, if given a product name that doesn't exist, will automatically create and add a new product with that name.

Sample I/O:
Choice (s/r/v/c/p/x): v
Whiteboard Marker - 85 at $1.50
Whiteboard Eraser - 45 at $5.00
Black Pen - 100 at $1.50
Red Pen - 100 at $1.50
Blue Pen - 100 at $1.50
Choice (s/r/v/c/p/x): s
Name: Green Pen
No such product
Choice (s/r/v/c/p/x): s
Name: black PEN
Selling Black Pen
Number: 1
Choice (s/r/v/c/p/x): s
Name: pen
Multiple products match:
Black Pen - 98 at $1.50
Red Pen - 100 at $1.50
Blue Pen - 100 at $1.50
Choice (s/r/v/c/p/x): s
Name: black
Selling Black Pen
Number: 1
Choice (s/r/v/c/p/x): v
Whiteboard Marker - 85 at $1.50
Whiteboard Eraser - 45 at $5.00
Black Pen - 98 at $1.50
Red Pen - 100 at $1.50
Blue Pen - 100 at $1.50
Choice (s/r/v/c/p/x): r
Name: whiteboard
Restocking Whiteboard Marker
Number: 3
Restocking Whiteboard Eraser
Number: 2
Choice (s/r/v/c/p/x): r
Name: Green Pen
Adding new product
Number: 30
Price: $2.30
Choice (s/r/v/c/p/x): v
Whiteboard Marker - 88 at $1.50
Whiteboard Eraser - 47 at $5.00
Black Pen - 98 at $1.50
Red Pen - 100 at $1.50
Blue Pen - 100 at $1.50
Green Pen - 30 at $2.30
Choice (s/r/v/c/p/x): x
Done