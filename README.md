# <center> AREA Project </center> #

### How to run service ###

* Run Docker's service
* execute: gradle build distDocker --refresh-dependencies
* execute next to create containers on docker: docker run --expose 1111 -p 1111:1111 -it com.area/registration-service:1.0
* execute next to start applications: docker docker run -d --expose 1111 -p 1111:1111 -it com.area/registration-service:1.0
* docker run -d --expose 2222 -p 2222:2222 -it com.area/location-service:1.0

### Short description of nodes ###
Documentation: [OSM Tags](https://taginfo.openstreetmap.org/)

<details> 
  <summary>building</summary>
  | Key | Value |
  | ---- | ----- |
  | house |	Жилое здание обычно предназначенное для одной семьи |
  | residential	| Общий тег для жилых зданий |
  |	garage | |
  |	garages | |
  |	apartments | Здание разделенное на отдельные жилые помещения, часто на разных этажах. Может иметь магазины розничной торговли на нижних этажах |
  |	hut	| Небольшая грубая постройка |
  |	industrial | Производственное здание |
  |	detached | Частный жилой дом |
  |	shed | | 
  |	roof | Для зданий в виде крыши, открытых хотя бы с двух сторон |
  | commercial | Места деловой активности |
  |	terrace | The outline of a linear row of residential dwellings, each of which normally has its own entrance, which form a terrace ("row-house" or "townhouse" in North American English) |
  |	school | Здание школы |
  |	retail | Здание, главным образом предназначенное для продажи товаров |
  |	greenhouse | Сооружение для выращивания растений |
  |	construction | Строящееся здание |
  |	farm_auxiliary | A building on a farm that is not a dwelling |
  |	church | Здание, построенное как церковь |
  |	barn | Сельскохозяйственная постройка, используемая как хранилище и как крытое рабочее место |
  |	warehouse | Коммерческое здание для хранения товаров |
  |	service | Служебные постройки с работающим оборудованием, не предназначенные для нахождения внутри людей |
  |	cabin | Небольшой, грубо построенный дом, обычно в сельской местности |
</details>