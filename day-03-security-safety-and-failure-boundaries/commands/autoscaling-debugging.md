# Autoscaling Debugging

## Observe HPA

kubectl get hpa

## Describe HPA

kubectl describe hpa <hpa-name>

Useful for:
- scaling thresholds
- stabilization windows
- scaling events
- cooldown behavior

## Observe Resource Usage

kubectl top pods

kubectl top nodes

## Watch Scaling Events

kubectl get pods -w

Useful for:
- rapid scaling
- startup storms
- oscillation behavior
