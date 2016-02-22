The purpose of this webservice is to retrieve information pertaining to Business addresses. The information will be
retrieved from a database and will be limited to:
* Name              (Business Name)
* Channel           (The category such as food, design, financial, etc)
* Channel Type      (A sub category such as butchers, art supplies, etc)
* Phone             (Phone number)
* Address           (Full human readable address)
* Town              (Town/City name)
* County            (Example: Dublin, Mayo)
* Region            (Example: Leinster, Munster)

NOTE: Accessed through localhost port 8081

NOTE: This is a prototype application designed to be used during the mid point presentation requirement of my final year
project. As this is a prototype, the data is currently being retrieved from an object in memory. Connection to a DB will
be included later.

19/01/2016 - Commit 1
This commit includes a working Web Service with one test
To be added:
- A full set of Scala Tests
- Further functionality
    - Return a filtered list based on Town/County/Region
    - Logging

22/02/2016 - Commit 2
This commit comprises of a BETA version of the application with working HTTP server (port 8081). The current version includes hard coded data which can be queried and filtered. Also included is a series of unit tests and logging
To be added
- Further Tests to tests the route output

