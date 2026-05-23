# kube-proxy Vs eBPF

Traditional Kubernetes networking commonly uses:
- kube-proxy
for:
- service traffic forwarding.

Modern networking increasingly uses:
- eBPF-based networking models.

---

# kube-proxy Limitations

Traditional networking often depends heavily on:
- iptables chains
- packet traversal
- and external traffic processing.

This may increase:
- complexity
- overhead
- and debugging difficulty.

---

# eBPF Advantages

eBPF enables:
- programmable packet processing directly inside the Linux kernel.

This improves:
- performance
- traffic visibility
- and runtime observability.

---

# Operational Benefits

eBPF-based networking improves:
- traffic control
- runtime debugging
- and communication visibility.

---

# Platform Engineering Perspective

Modern networking increasingly focuses on:
- runtime communication engineering.

---

# Key Insight

eBPF enables programmable traffic visibility and control inside the Linux kernel.
