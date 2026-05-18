# HPA Debugging Commands

## View HPA Status
kubectl get hpa

## Describe HPA Behavior
kubectl describe hpa <hpa-name>

## Watch HPA Scaling Events
kubectl get hpa -w

## View Current Replica Counts
kubectl get deploy

## Check Metrics Availability
kubectl top pods
kubectl top nodes

## Verify Metrics Server
kubectl get apiservices | grep metrics
kubectl get pods -n kube-system

## Check HPA Events
kubectl describe hpa <hpa-name> | grep Events -A20

## Verify Target Metrics
kubectl describe hpa <hpa-name>

## Inspect ReplicaSet Changes
kubectl get rs

## Watch Pod Scaling
kubectl get pods -w
