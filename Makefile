install:
	mvn clean install spring-boot:repackage

container: install
	docker build -t phughk/tor-hidden-service:latest .

genkey:
	# https://peterlyons.com/problog/2017/12/openssh-ed25519-private-key-file-format/
	ssh-keygen -t ed25519 -f ssh-ed25519-private-key.pem -N ""
	grep -v - ssh-ed25519-private-key.pem | base64 -D | xxd -p > private-key.b64

start:
	docker-compose up
