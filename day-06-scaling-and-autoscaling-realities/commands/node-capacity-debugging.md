# Node Capacity Debugging Commands

## View Node Capacity
kubectl describe nodes

## Check Node Resource Usage
kubectl top nodes

## View Pending Pods
kubectl get pods --all-namespaces | grep Pending

## Describe Pending Pod
kubectl describe pod <pod-name>

## Check Scheduling Failures
kubectl get events --sort-by=.metadata.creationTimestamp

## Inspect Node Allocatable Resources
kubectl describe node <node-name>

## View Cluster Autoscaler Pods
kubectl get pods -n kube-system

## Check Node Conditions
kubectl get nodes
kubectl describe nodes

## Watch Node Scaling
kubectl get nodes -w

## Inspect Taints
kubectl describe node <node-name> | grep Taints
