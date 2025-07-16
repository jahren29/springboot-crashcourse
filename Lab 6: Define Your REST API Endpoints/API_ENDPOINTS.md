| Resources    | HTTP Verb | Resource URL                             | Use Case                                               |
| ------------ | --------- | ---------------------------------------- | ------------------------------------------------------ |
| Visitor      | POST      | /zoos/id/visitors/id/tickets/id          | Creating Ticket                                        |
|              | GET       | /zoos/id/visitors/id/tickets/id          | Getting the Ticket                                     |
|              | POST      | /zoos/id/visitors/id/enclosure/id        | Visits Specific Enclosure                              |
|              | POST      | /zoos/id/visitors/id/shop/id             | Visits Shop                                            |
|              | GET       | /visitors/id/shop                        | Visitor buys gift                                      |
|              | DELETE    | /visitors/id                             | Leaves                                                 |
| Shop         | POST      | /zoos/id/shops                           | Buying Gifts                                           |
|              | GET       | /zoos/id/shops/id/gifts                  | Purchasing Gifts                                       |
|              | GET       | /zoos/id/shops/id/gifts/id               | Gets details of a Gift product                         |
|              | POST      | /zoos/id/shops/id/gifts                  | Create new product.                                    |
| Veterinarian | POST      | /zoos/id/enclosure/id/animals/id/heal    | Veterinarian Healing the animal                        |
|              | POST      | /zoos/id/hospitals/id/visitors/          | Veterinarian Lectures the Visitors                     |
|              | GET       | /zoos/id/hospitals/id/animal/id          | Gets animal name                                       |
| Handler      | POST      | /zoos/id/enclosure/id/animals/id/examine | Handler Examines the animal                            |
|              | POST      | /zoos/id/enclosure/id/animals/id/feed    | Handler is Feeding the animal                          |
|              | POST      | /zoos/id/enclosure/id/animals/id/roam    | Handler is Roaming the Animal                          |
|              | PATCH     | /zoos/id/enclosure/id/animal/id/         | Sends the animal to hospital                           |
| Hospital     | PATCH     | /zoos/id/hospitals/id                    | Returns the animal to the zoo                          |
|              | GET       | /zoos/id/hospitals/id                    | Admits the Animal to the zoo                           |
|              | GET       | /zoos/id/hospitals/id                    | Gets the list of all animals admitted in the hospital. |
|              | DELETE    | /zoos/id/veterinarian/id                 | Removes Veterinarian                                   |
| Manager      | POST      | /zoos/id/                                | closed the zoo                                         |
|              | POST      | /zoos/id/                                | opens the zoo                                          |
| Tickets      | POST      | /zoos/id/ticketshop/id                   | create new ticket.                                     |
|              | GET       | /zoos/id/ticketshop/id                   | get ticket details                                     |
|              | GET       | /zoos/id/ticketshop                      | get all tickets                                        |
| Items        | POST      | /zoos/id/shop/id                         | add new item.                                          |
|              | GET       | /zoos/id/shop/id                         | get new item.                                          |
|              | GET       | /zoos/id/shop                            | Get all items.                                         |
|              | DELETE    | /zoos/id/shop/id                         | Delete specific item.                                  |

<br><br><br>


![Screenshot 2025-07-16 at 6.36.59 PM.png](Screenshot%202025-07-16%20at%206.36.59%E2%80%AFPM.png)
