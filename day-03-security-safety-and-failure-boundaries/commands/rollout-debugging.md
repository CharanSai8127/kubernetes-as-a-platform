# Rollout Debugging

## Observe Rollout Status

kubectl rollout status deployment/<deployment-name>

## Rollout History

kubectl rollout history deployment/<deployment-name>

## Rollback Deployment

kubectl rollout undo deployment/<deployment-name>

## Watch Pods During Rollout

kubectl get pods -w

Useful for:
- rollout pacing
- startup storms
- readiness instability
- rollout failures

## Check Deployment Strategy

kubectl get deploy <deployment-name> -o yaml

Inspect:
- maxSurge
- maxUnavailable
- minReadySeconds
