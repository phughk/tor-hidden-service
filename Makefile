install:
	mvn clean install spring-boot:repackage

container: install
	docker build -t phughk/tor-hidden-service:latest .
