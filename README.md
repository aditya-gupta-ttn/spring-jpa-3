9. Using detach method in spring data jpa

        @PersistenceContext
        private EntityManager entityManager;

        @Transactional
        public void removeAuthorFromCache(Long id) {
        Author author = entityManager.find(Author.class, id);
        entityManager.detach(author); // Removes the author entity from cache
        }

10. @transacational when applied above a class or a method, it ensures that operations that are to be done on database will be executed within a transaction. If the transaction is successful, the changes will be committed to the database, else upon failure the transaction will be rolled back and the database remains unaffected.  
