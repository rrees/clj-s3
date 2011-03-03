(ns clj-s3.core)

(defn s3-client [] (new com.amazonaws.services.s3.AmazonS3Client) )