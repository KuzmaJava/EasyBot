# EasyBot

- Добавление товара

Для добавления товара нужно выполнить запрос POST
по данному url : http://localhost:8080/store/items/add
( например, в PostMan)
с данными JSON-параметрами:

{
    "price" : 40,
    "quantity" : 2,
    "category" : {
        "id" : 2,
        "name" : "LAPTOP"
    },
    "description" : "17 inches"
}
-  Редактирование товара

Для редактирования товара нужно выполнить запрос PUT по данному URL : 
http://localhost:8080/store/items/edit/{id} , передав id item'a, которую хотим изменить и новый Item соответственно.
Пример : http://localhost:8080/store/items/edit/1

{
    "price" : 1,
    "quantity" : 2,
    "category" : {
        "id" : 2,
        "name" : "LAPTOP"
    },
    "description" : "17 inches"
}
-  Просмотр всех существующих товаров по типу 

Для просмотра существующих товаров по типу нужно пройти по данному URL :
http://localhost:8080/store/items/findByType/{id} 
и в качестве id указать нужный тип ( 1 - MONITORS, 2 - LAPTOPS, 3 - DESKTOPS, 4 - HARD DISKS)

- Просмотр товара по идентификатору
Чтобы просмотреть товар по идентификатору, нужно пройти по данному URL : 
http://localhost:8080/store/items/getById/{id} , в качестве id нужный нам идентификатор.
