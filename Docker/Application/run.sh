container_name=freetime_instance

if [ "$( docker container inspect -f '{{.State.Running}}' $container_name )" == "true" ]; then
	echo "container running, patching"
	docker restart $container_name
else
	echo "container not running, creating container"
	docker run -d --name $container_name --network freetime --hostname application.com --ip 192.168.0.3 -v /home/lizhuolu/Workspace/FreeTime/FreeTime:/usr/local/Application -p 8080:8080 -p 8443:8443 --entrypoint ./mvnw freetime springboot:run
fi
