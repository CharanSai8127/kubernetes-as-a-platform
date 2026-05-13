# Failure Investigation

## Observe Cluster Events

kubectl get events --sort-by=.metadata.creationTimestamp

Useful for:
- scheduling failures
- restart storms
- eviction events
- rollout instability

## Observe Pod Status

kubectl get pods -A

Look for:
- CrashLoopBackOff
- Pending
- Error
- OOMKilled

## Observe Node Health

kubectl get nodes

kubectl describe node <node-name>

Useful for:
- node pressure
- memory exhaustion
- disk pressure
- network instability

## Observe Recent Rollouts

kubectl rollout history deployment/<deployment-name>

Useful for:
- failed releases
- bad rollouts
- rollback analysis
