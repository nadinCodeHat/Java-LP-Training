aws ssm put-parameter --name /techsolutions/student-service/dev/database/pg/hostname --value 'COPY-AND-PASTE_DATABASE-URL' --type String --region us-west-2 --data-type text --profile sls
aws ssm put-parameter --name /techsolutions/student-service/dev/database/pg/port --value '5432' --type String --region us-west-2 --data-type text --profile sls
aws ssm put-parameter --name /techsolutions/student-service/dev/database/pg/database --value 'studentdb' --type String --region us-west-2 --data-type text --profile sls
aws ssm put-parameter --name /techsolutions/student-service/dev/database/pg/username --value 'postgres' --type String --region us-west-2 --data-type text --profile sls
aws ssm put-parameter --name /techsolutions/student-service/dev/database/pg/password --value 'YOUR-PASSWORD' --type String --region us-west-2 --data-type text --profile sls
aws ssm put-parameter --name /techsolutions/student-service/dev/database/pg/schema --value 'public' --type String --region us-west-2 --data-type text --profile sls