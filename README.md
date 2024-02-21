# serverless-api-aws serverless API
The serverless-api-aws project, created with [`aws-serverless-java-container`](https://github.com/aws/serverless-java-container).

This API has endpoints to create, retrieve and delete product. This integrates with DynamoDB to perform
the CRUD operations. Finally deployed to AWS Functions in a Serverless way and integrated with API Gateway.


## Building the project
 We have to remove the Tomcat server exclusion definitions from POM file inorder to run locally.

* Create the table "**_teq_product_**" in AWS DynamoDB.
* Build the project and deploy the generated **_zip_** file to AWS Function.
* Create API Gateway with path: **/{proxy+}**, method: **_ANY_** and deploy API to a Stage
* We can test the endpoints using API Gateway Invoke URL link from any of the client.

Please refer to the **_template.yml_** in the project directory for corresponding SAM template.