# SpringBootCacheManagement

1. The project cache management deals with caching account details with uniuqe account id.
2. I have used spring boot modules such as ecache, jpa and H2 and web to demonstrate the caching mechanism. 
3. Configurations for cache system like heap memory space, cache live time etc .. are defined in ecache.xml
4. Implemented dataloader module to load dummy values postconstruct.
5. @Cacheable(value="accountCache", key="#accountId", sync=true) annotation in account cache class performs the following
   * Stores the account details for each unique account id fetch into cache memory
   * If the details not found for any account id, it will retrieve from the database
   * If the application is mutithreaded, annotation sync will make sure only first thread hit the database and rest of the threads with the same account id will fetch details from cache. If account id is different it will fetch from database.
   
 6. Testing the application
    * Import the project into workspace and build the project using maven
    * Right click on CacheManagementApplication class and run as spring boot application
    * Access the Rest end point URL : http://localhost:8080/rest/account/{accountId}
      accountId is the account no of the customer.
      

